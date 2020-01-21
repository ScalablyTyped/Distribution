package typings.angularCommon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatWidth extends js.Object

@JSImport("@angular/common", "FormatWidth")
@js.native
object FormatWidth extends js.Object {
  /**
    * For `en-US`, `'EEEE, MMMM d, y, h:mm:ss a zzzz'`
    * (Example: `Monday, June 15, 2015 at 9:03:01 AM GMT+01:00`)
    */
  @js.native
  sealed trait Full extends FormatWidth
  
  /**
    * For `en-US`, `'MMMM d, y, h:mm:ss a z'`
    * (Example: `June 15, 2015 at 9:03:01 AM GMT+1`)
    */
  @js.native
  sealed trait Long extends FormatWidth
  
  /**
    * For `en-US`, `'MMM d, y, h:mm:ss a'`
    * (Example: `Jun 15, 2015, 9:03:01 AM`)
    */
  @js.native
  sealed trait Medium extends FormatWidth
  
  /**
    * For `en-US`, 'M/d/yy, h:mm a'`
    * (Example: `6/15/15, 9:03 AM`)
    */
  @js.native
  sealed trait Short extends FormatWidth
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormatWidth with Double] = js.native
  /* 3 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  /* 2 */ @js.native
  object Long extends TopLevel[Long with Double]
  
  /* 1 */ @js.native
  object Medium extends TopLevel[Medium with Double]
  
  /* 0 */ @js.native
  object Short extends TopLevel[Short with Double]
  
}

