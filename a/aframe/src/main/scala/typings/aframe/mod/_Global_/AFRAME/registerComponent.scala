package typings.aframe.mod._Global_.AFRAME

import org.scalablytyped.runtime.TopLevel
import typings.aframe.mod.ComponentConstructor
import typings.aframe.mod.ComponentDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.registerComponent")
@js.native
object registerComponent
  extends TopLevel[
      js.Function2[
        /* name */ String, 
        /* component */ ComponentDefinition[js.Object], 
        ComponentConstructor[js.Object]
      ]
    ]

