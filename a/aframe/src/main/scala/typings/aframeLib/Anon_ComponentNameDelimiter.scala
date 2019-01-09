package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ComponentNameDelimiter extends js.Object {
  def getComponentProperty(
    entity: aframeLib.aframeMod.Entity[
      aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
    ],
    componentName: java.lang.String
  ): js.Any = js.native
  def getComponentProperty(
    entity: aframeLib.aframeMod.Entity[
      aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
    ],
    componentName: java.lang.String,
    delimiter: java.lang.String
  ): js.Any = js.native
  def setComponentProperty(
    entity: aframeLib.aframeMod.Entity[
      aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
    ],
    componentName: java.lang.String,
    value: js.Any
  ): scala.Unit = js.native
  def setComponentProperty(
    entity: aframeLib.aframeMod.Entity[
      aframeLib.aframeMod.ObjectMap[aframeLib.aframeMod.Component[_, aframeLib.aframeMod.System[_]]]
    ],
    componentName: java.lang.String,
    value: js.Any,
    delimiter: java.lang.String
  ): scala.Unit = js.native
}

