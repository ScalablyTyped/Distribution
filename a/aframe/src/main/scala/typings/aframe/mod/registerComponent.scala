package typings.aframe.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "registerComponent")
@js.native
object registerComponent
  extends TopLevel[
      js.Function2[
        /* name */ String, 
        /* component */ ComponentDefinition[js.Object], 
        ComponentConstructor[js.Object]
      ]
    ]

