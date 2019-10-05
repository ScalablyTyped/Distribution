package typings.aframe.aframeMod.Global.AFRAME

import org.scalablytyped.runtime.TopLevel
import typings.aframe.aframeMod.SystemConstructor
import typings.aframe.aframeMod.SystemDefinition
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

