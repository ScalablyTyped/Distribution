package typings.aframe.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "registerGeometry")
@js.native
object registerGeometry
  extends TopLevel[
      js.Function2[
        /* name */ String, 
        /* geometry */ GeometryDefinition[js.Object, js.Any], 
        GeometryConstructor[js.Object]
      ]
    ]

