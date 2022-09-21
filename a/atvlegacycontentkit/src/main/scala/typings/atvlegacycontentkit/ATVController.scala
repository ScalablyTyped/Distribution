package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atv.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A controller on a scriptView page.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVController extends StObject {
  
  var view: View
}
object ATVController {
  
  inline def apply(view: View): ATVController = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVController]
  }
  
  extension [Self <: ATVController](x: Self) {
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
