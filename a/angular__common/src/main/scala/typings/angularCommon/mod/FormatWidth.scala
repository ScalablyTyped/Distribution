package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FormatWidth extends StObject
@JSImport("@angular/common", "FormatWidth")
@js.native
object FormatWidth extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormatWidth & Double] = js.native
  
  /**
    * For `en-US`, `'EEEE, MMMM d, y, h:mm:ss a zzzz'`
    * (Example: `Monday, June 15, 2015 at 9:03:01 AM GMT+01:00`)
    */
  @js.native
  sealed trait Full
    extends StObject
       with FormatWidth
  /* 3 */ val Full: typings.angularCommon.mod.FormatWidth.Full & Double = js.native
  
  /**
    * For `en-US`, `'MMMM d, y, h:mm:ss a z'`
    * (Example: `June 15, 2015 at 9:03:01 AM GMT+1`)
    */
  @js.native
  sealed trait Long
    extends StObject
       with FormatWidth
  /* 2 */ val Long: typings.angularCommon.mod.FormatWidth.Long & Double = js.native
  
  /**
    * For `en-US`, `'MMM d, y, h:mm:ss a'`
    * (Example: `Jun 15, 2015, 9:03:01 AM`)
    */
  @js.native
  sealed trait Medium
    extends StObject
       with FormatWidth
  /* 1 */ val Medium: typings.angularCommon.mod.FormatWidth.Medium & Double = js.native
  
  /**
    * For `en-US`, 'M/d/yy, h:mm a'`
    * (Example: `6/15/15, 9:03 AM`)
    */
  @js.native
  sealed trait Short
    extends StObject
       with FormatWidth
  /* 0 */ val Short: typings.angularCommon.mod.FormatWidth.Short & Double = js.native
}
