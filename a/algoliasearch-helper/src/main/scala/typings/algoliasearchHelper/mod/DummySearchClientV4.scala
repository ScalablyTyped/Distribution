package typings.algoliasearchHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DummySearchClientV4 extends StObject {
  
  var transporter: js.Any
}
object DummySearchClientV4 {
  
  inline def apply(transporter: js.Any): DummySearchClientV4 = {
    val __obj = js.Dynamic.literal(transporter = transporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DummySearchClientV4]
  }
  
  extension [Self <: DummySearchClientV4](x: Self) {
    
    inline def setTransporter(value: js.Any): Self = StObject.set(x, "transporter", value.asInstanceOf[js.Any])
  }
}
