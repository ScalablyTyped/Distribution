package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StringDictionary
import typings.aceBuilds.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CommandLike = Command | (js.Function1[/* editor */ Editor, Unit])

type CommandMap = StringDictionary[Command]

type CompleterCallback = js.Function2[/* error */ Any, /* completions */ js.Array[Completion], Unit]

type MarkerRenderer = js.Function5[
/* html */ js.Array[String], 
/* range */ Range, 
/* left */ Double, 
/* top */ Double, 
/* config */ Any, 
Unit]

type execEventHandler = js.Function1[/* obj */ Args, Unit]
