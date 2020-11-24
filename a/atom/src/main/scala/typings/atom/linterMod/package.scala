package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object linterMod {
  
  type IndieProvider = js.Function1[
    /* register */ js.Function1[/* config */ typings.atom.linterMod.Config, typings.atom.linterMod.IndieDelegate], 
    scala.Unit
  ]
  
  type LintResult = js.Array[typings.atom.linterMod.Message] | scala.Null
}
