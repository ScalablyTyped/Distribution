package typings.aframe.mod.global.AFRAME

import org.scalablytyped.runtime.TopLevel
import typings.aframe.mod.MinimalShaderDefinition
import typings.aframe.mod.ShaderConstructor
import typings.aframe.mod.ShaderDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
