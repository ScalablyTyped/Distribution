package typings.aframe.aframeMod.Global.AFRAME

import org.scalablytyped.runtime.TopLevel
import typings.aframe.aframeMod.ComponentConstructor
import typings.aframe.aframeMod.ComponentDefinition
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

