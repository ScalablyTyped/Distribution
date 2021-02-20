package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TranslationWidth extends StObject
@JSImport("@angular/common", "TranslationWidth")
@js.native
object TranslationWidth extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TranslationWidth with Double] = js.native
  
  /** 3 characters for `en-US`. For example: 'Sun' */
  @js.native
  sealed trait Abbreviated extends TranslationWidth
  /* 1 */ val Abbreviated: typings.angularCommon.mod.TranslationWidth.Abbreviated with Double = js.native
  
  /** 1 character for `en-US`. For example: 'S' */
  @js.native
  sealed trait Narrow extends TranslationWidth
  /* 0 */ val Narrow: typings.angularCommon.mod.TranslationWidth.Narrow with Double = js.native
  
  /** 2 characters for `en-US`, For example: "Su" */
  @js.native
  sealed trait Short extends TranslationWidth
  /* 3 */ val Short: typings.angularCommon.mod.TranslationWidth.Short with Double = js.native
  
  /** Full length for `en-US`. For example: "Sunday" */
  @js.native
  sealed trait Wide extends TranslationWidth
  /* 2 */ val Wide: typings.angularCommon.mod.TranslationWidth.Wide with Double = js.native
}
