package typings.antvG2plot

import typings.antvG2.libInterfaceMod.AxisCfg
import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.antvG2plot.antvG2plotStrings.formatter
import typings.antvG2plot.antvG2plotStrings.values
import typings.antvG2plot.metaMod.Meta
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axisMod {
  
  type Axis = `false` | (AxisCfg & (Omit[Meta, values | formatter]))
}
