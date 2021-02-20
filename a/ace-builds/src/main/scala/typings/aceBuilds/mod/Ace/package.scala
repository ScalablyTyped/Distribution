package typings.aceBuilds.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Ace {
  
  type CommandLike = typings.aceBuilds.mod.Ace.Command | (js.Function1[/* editor */ typings.aceBuilds.mod.Ace.Editor, scala.Unit])
  
  type CommandMap = org.scalablytyped.runtime.StringDictionary[typings.aceBuilds.mod.Ace.Command]
  
  type CompleterCallback = js.Function2[
    /* error */ js.Any, 
    /* completions */ js.Array[typings.aceBuilds.mod.Ace.Completion], 
    scala.Unit
  ]
  
  type MarkerRenderer = js.Function5[
    /* html */ js.Array[java.lang.String], 
    /* range */ typings.aceBuilds.mod.Ace.Range, 
    /* left */ scala.Double, 
    /* top */ scala.Double, 
    /* config */ js.Any, 
    scala.Unit
  ]
  
  type execEventHandler = js.Function1[/* obj */ typings.aceBuilds.anon.Args, scala.Unit]
}
