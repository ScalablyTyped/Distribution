package typings
package atAntDashDesignProDashLayoutLib.libBasicLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in 'location' ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/BasicLayout.BasicLayoutProps[K]} & {  breadcrumb  :{[path: string] : @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.MenuDataItem}} */
trait BasicLayoutContext extends js.Object {
  var breadcrumb: org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem]
  var location: js.Any
}

object BasicLayoutContext {
  @scala.inline
  def apply(
    breadcrumb: org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.libTypingsMod.MenuDataItem],
    location: js.Any
  ): BasicLayoutContext = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb, location = location)
  
    __obj.asInstanceOf[BasicLayoutContext]
  }
}

