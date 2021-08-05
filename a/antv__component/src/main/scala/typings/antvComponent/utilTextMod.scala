package typings.antvComponent

import typings.antvComponent.antvComponentNumbers.`1`
import typings.antvComponent.antvComponentNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilTextMod {
  
  @JSImport("@antv/component/lib/util/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def charAtLength(str: String, i: Double): `1` | `2` = (^.asInstanceOf[js.Dynamic].applyDynamic("charAtLength")(str.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[`1` | `2`]
  
  inline def ellipsisString(str: String, reseveLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisString")(str.asInstanceOf[js.Any], reseveLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def ellipsisString(str: String, reseveLength: Double, position: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisString")(str.asInstanceOf[js.Any], reseveLength.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def strLen(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("strLen")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
}
