package typings.ace.AceAjax

import org.scalablytyped.runtime.StringDictionary
import typings.ace.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CommandLike = EditorCommand | (js.Function1[/* editor */ Editor, Unit])

type CommandMap = StringDictionary[EditorCommand]

type CompletionCallback = js.Function2[/* error */ js.Error | Null, /* results */ js.Array[Completion], Unit]

type execEventHandler = js.Function1[/* obj */ Args, Unit]
