package typings.aframe.mod.global.AFRAME

import org.scalablytyped.runtime.TopLevel
import typings.aframe.mod.SystemConstructor
import typings.aframe.mod.SystemDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.registerSystem")
@js.native
object registerSystem
  extends TopLevel[
      js.Function2[
        /* name */ String, 
        /* definition */ SystemDefinition[js.Object], 
        SystemConstructor[js.Object]
      ]
    ]

