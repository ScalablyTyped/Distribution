package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object actionSheetMod {
  
  type ActionCallBack = js.Function2[
    /* index */ scala.Double, 
    /* rowIndex */ js.UndefOr[scala.Double], 
    js.Thenable[js.Any] | scala.Unit
  ]
}
