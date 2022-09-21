package typings.antvG2plot.mod

import typings.antvG2plot.anon.PartialWordCloudOptions
import typings.antvG2plot.wordCloudTypesMod.WordCloudOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "WordCloud")
@js.native
open class WordCloud protected ()
  extends typings.antvG2plot.wordCloudMod.WordCloud {
  def this(container: String, options: WordCloudOptions) = this()
  def this(container: HTMLElement, options: WordCloudOptions) = this()
}
/* static members */
object WordCloud {
  
  @JSImport("@antv/g2plot", "WordCloud")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 词云图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialWordCloudOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialWordCloudOptions]
}
