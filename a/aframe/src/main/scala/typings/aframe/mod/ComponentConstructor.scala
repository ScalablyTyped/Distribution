package typings.aframe.mod

import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConstructor[T /* <: js.Object */]
  extends Instantiable3[
      /* el */ Entity[ObjectMap[Component[js.Any, System[js.Any]]]], 
      /* attrValue */ String, 
      /* id */ String, 
      T with (Component[_, System[_]])
    ]

