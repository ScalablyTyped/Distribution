package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCfg
  extends StObject
     with FacetCfg[ListData] {
  
  /**
    * @title 指定每行可显示分面的个数，超出时会自动换行。
    */
  val cols: js.UndefOr[Double] = js.native
  
  /**
    * @title 每个分面标题配置。
    */
  val title: js.UndefOr[FacetTitle] = js.native
}
