package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait El extends StObject {
  
  var el: Element | (Entity[ObjectMap[Component[Any, System[Any]]]])
}
object El {
  
  inline def apply(el: Element | (Entity[ObjectMap[Component[Any, System[Any]]]])): El = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[El]
  }
  
  extension [Self <: El](x: Self) {
    
    inline def setEl(value: Element | (Entity[ObjectMap[Component[Any, System[Any]]]])): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
