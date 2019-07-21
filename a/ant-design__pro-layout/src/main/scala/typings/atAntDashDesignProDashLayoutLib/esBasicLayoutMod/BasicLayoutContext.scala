package typings
package atAntDashDesignProDashLayoutLib.esBasicLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in 'location' ]: @ant-design/pro-layout.@ant-design/pro-layout/es/BasicLayout.BasicLayoutProps[K]} & {  breadcrumb  :{[path: string] : @ant-design/pro-layout.@ant-design/pro-layout/es/typings.MenuDataItem}} */
trait BasicLayoutContext extends js.Object {
  var breadcrumb: org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem]
  var location: js.Any
}

object BasicLayoutContext {
  @scala.inline
  def apply(
    breadcrumb: org.scalablytyped.runtime.StringDictionary[atAntDashDesignProDashLayoutLib.esTypingsMod.MenuDataItem],
    location: js.Any
  ): BasicLayoutContext = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb, location = location)
  
    __obj.asInstanceOf[BasicLayoutContext]
  }
}

