package typings.aframe.mod.global.AFRAME

import org.scalablytyped.runtime.TopLevel
import typings.aframe.mod.GeometryConstructor
import typings.aframe.mod.GeometryDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.registerGeometry")
@js.native
object registerGeometry
  extends TopLevel[
      js.Function2[
        /* name */ String, 
        /* geometry */ GeometryDefinition[js.Object, js.Any], 
        GeometryConstructor[js.Object]
      ]
    ]

