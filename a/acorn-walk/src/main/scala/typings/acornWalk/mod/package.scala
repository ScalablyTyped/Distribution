package typings.acornWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AncestorVisitors[TState] = org.scalablytyped.runtime.StringDictionary[typings.acornWalk.mod.AncestorWalkerFn[TState]]
  
  type AncestorWalkerFn[TState] = js.Function3[
    /* node */ typings.acorn.mod.Node, 
    /* state */ TState | js.Array[typings.acorn.mod.Node], 
    /* ancestors */ js.Array[typings.acorn.mod.Node], 
    scala.Unit
  ]
  
  type FindPredicate = js.Function2[/* type */ java.lang.String, /* node */ typings.acorn.mod.Node, scala.Boolean]
  
  type FullAncestorWalkerCallback[TState] = js.Function4[
    /* node */ typings.acorn.mod.Node, 
    /* state */ TState | js.Array[typings.acorn.mod.Node], 
    /* ancestors */ js.Array[typings.acorn.mod.Node], 
    /* type */ java.lang.String, 
    scala.Unit
  ]
  
  type FullWalkerCallback[TState] = js.Function3[
    /* node */ typings.acorn.mod.Node, 
    /* state */ TState, 
    /* type */ java.lang.String, 
    scala.Unit
  ]
  
  type RecursiveVisitors[TState] = org.scalablytyped.runtime.StringDictionary[typings.acornWalk.mod.RecursiveWalkerFn[TState]]
  
  type RecursiveWalkerFn[TState] = js.Function3[
    /* node */ typings.acorn.mod.Node, 
    /* state */ TState, 
    /* callback */ typings.acornWalk.mod.WalkerCallback[TState], 
    scala.Unit
  ]
  
  type SimpleVisitors[TState] = org.scalablytyped.runtime.StringDictionary[typings.acornWalk.mod.SimpleWalkerFn[TState]]
  
  type SimpleWalkerFn[TState] = js.Function2[/* node */ typings.acorn.mod.Node, /* state */ TState, scala.Unit]
  
  type WalkerCallback[TState] = js.Function2[/* node */ typings.acorn.mod.Node, /* state */ TState, scala.Unit]
}
