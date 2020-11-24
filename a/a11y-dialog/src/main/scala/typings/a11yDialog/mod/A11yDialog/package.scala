package typings.a11yDialog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object A11yDialog {
  
  type EventHandler = js.Function2[
    /* node */ typings.std.Element, 
    /* event */ js.UndefOr[typings.std.Event], 
    scala.Unit
  ]
  
  type Targets = typings.std.NodeList | typings.std.Element | java.lang.String
}
