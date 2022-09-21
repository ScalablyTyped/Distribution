package typings.aframe.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentConstructor[T /* <: js.Object */]
  extends StObject
     with Instantiable3[
      /* el */ Entity[ObjectMap[Component[Any, System[Any]]]], 
      /* attrValue */ String, 
      /* id */ String, 
      T & (Component[Any, System[Any]])
    ]
