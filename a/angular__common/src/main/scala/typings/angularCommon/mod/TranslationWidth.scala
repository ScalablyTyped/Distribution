package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TranslationWidth extends StObject
@JSImport("@angular/common", "TranslationWidth")
@js.native
object TranslationWidth extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TranslationWidth & Double] = js.native
  
  /** 3 characters for `en-US`. For example: 'Sun' */
  @js.native
  sealed trait Abbreviated
    extends StObject
       with TranslationWidth
  /* 1 */ val Abbreviated: typings.angularCommon.mod.TranslationWidth.Abbreviated & Double = js.native
  
  /** 1 character for `en-US`. For example: 'S' */
  @js.native
  sealed trait Narrow
    extends StObject
       with TranslationWidth
  /* 0 */ val Narrow: typings.angularCommon.mod.TranslationWidth.Narrow & Double = js.native
  
  /** 2 characters for `en-US`, For example: "Su" */
  @js.native
  sealed trait Short
    extends StObject
       with TranslationWidth
  /* 3 */ val Short: typings.angularCommon.mod.TranslationWidth.Short & Double = js.native
  
  /** Full length for `en-US`. For example: "Sunday" */
  @js.native
  sealed trait Wide
    extends StObject
       with TranslationWidth
  /* 2 */ val Wide: typings.angularCommon.mod.TranslationWidth.Wide & Double = js.native
}
