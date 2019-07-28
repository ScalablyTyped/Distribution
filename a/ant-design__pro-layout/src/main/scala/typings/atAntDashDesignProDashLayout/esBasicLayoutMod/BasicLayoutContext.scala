package typings.atAntDashDesignProDashLayout.esBasicLayoutMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAntDashDesignProDashLayout.esTypingsMod.MenuDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in 'location' ]: @ant-design/pro-layout.@ant-design/pro-layout/es/BasicLayout.BasicLayoutProps[K]} & {  breadcrumb  :{[path: string] : @ant-design/pro-layout.@ant-design/pro-layout/es/typings.MenuDataItem}} */
trait BasicLayoutContext extends js.Object {
  var breadcrumb: StringDictionary[MenuDataItem]
  var location: js.Any
}

object BasicLayoutContext {
  @scala.inline
  def apply(breadcrumb: StringDictionary[MenuDataItem], location: js.Any): BasicLayoutContext = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb, location = location)
  
    __obj.asInstanceOf[BasicLayoutContext]
  }
}

