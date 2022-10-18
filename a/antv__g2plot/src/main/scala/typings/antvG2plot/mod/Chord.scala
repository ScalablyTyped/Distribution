package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialChordOptions
import typings.antvG2plot.libPlotsChordTypesMod.ChordOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Chord")
@js.native
open class Chord protected ()
  extends typings.antvG2plot.libPlotsChordMod.Chord {
  def this(container: String, options: ChordOptions) = this()
  def this(container: HTMLElement, options: ChordOptions) = this()
}
/* static members */
object Chord {
  
  @JSImport("@antv/g2plot", "Chord")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 面积图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialChordOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialChordOptions]
}
