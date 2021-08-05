package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  val Width: Double
}
object Width {
  
  inline def apply(Width: Double): Width = {
    val __obj = js.Dynamic.literal(Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
  
  extension [Self <: Width](x: Self) {
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
