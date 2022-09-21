package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTemplateMod {
  
  @JSImport("@antv/g2plot/lib/utils/template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def template(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def template(source: String, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(source.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
}
