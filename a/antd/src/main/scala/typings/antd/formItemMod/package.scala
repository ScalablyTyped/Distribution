package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formItemMod {
  type ChildrenType = typings.antd.formItemMod.RenderChildren | typings.react.mod.ReactNode
  type RcFieldProps = typings.std.Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FieldProps */ js.Any, 
    typings.antd.antdStrings.children
  ]
  type RenderChildren = js.Function1[
    /* form */ typings.rcFieldForm.interfaceMod.FormInstance, 
    typings.react.mod.ReactNode
  ]
}
