package typings.avvio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OnClose[I, C] = js.Function1[/* fn */ js.Function2[/* context */ C, /* done */ js.Function, scala.Unit], C]
  
  type Plugin[O, I] = js.Function3[
    /* server */ typings.avvio.mod.context[I], 
    /* options */ O, 
    /* done */ js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit], 
    scala.Unit
  ]
  
  type Use[I, C] = js.Function2[/* fn */ typings.avvio.mod.Plugin[js.Any, I], /* options */ js.UndefOr[js.Any], C]
  
  type context[I] = typings.avvio.mod.mixedInstance[I] | typings.avvio.mod.Avvio[I]
  
  type mixedInstance[I] = I with typings.avvio.mod.Server[I]
}
