package typings.aframe.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "registerShader")
@js.native
object registerShader
  extends TopLevel[
      js.Function2[
        /* name */ String, 
        /* shader */ ShaderDefinition[MinimalShaderDefinition with js.Object], 
        ShaderConstructor[MinimalShaderDefinition with js.Object]
      ]
    ]

