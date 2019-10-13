package typings.aframe.aframeMod._Global_.AFRAME

import org.scalablytyped.runtime.TopLevel
import typings.aframe.aframeMod.MinimalShaderDefinition
import typings.aframe.aframeMod.ShaderConstructor
import typings.aframe.aframeMod.ShaderDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.registerShader")
@js.native
object registerShader
  extends TopLevel[
      js.Function2[
        /* name */ String, 
        /* shader */ ShaderDefinition[MinimalShaderDefinition with js.Object], 
        ShaderConstructor[MinimalShaderDefinition with js.Object]
      ]
    ]

