package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object formItemMod {
  
  type ChildrenType[Values] = typings.antd.formItemMod.RenderChildren[Values] | typings.react.mod.ReactNode
  
  type RenderChildren[Values] = js.Function1[
    /* form */ typings.rcFieldForm.interfaceMod.FormInstance[Values], 
    typings.react.mod.ReactNode
  ]
}
