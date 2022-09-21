package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.chordTypesMod.ChordOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chordAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/chord/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[ChordOptions]): Params[ChordOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[ChordOptions]]
}
