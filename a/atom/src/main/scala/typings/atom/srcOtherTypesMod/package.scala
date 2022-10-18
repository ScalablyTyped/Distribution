package typings.atom.srcOtherTypesMod

import typings.atom.atomStrings.created
import typings.atom.atomStrings.deleted
import typings.atom.atomStrings.modified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type FilesystemChange = (FilesystemChangeBasic[created | modified | deleted]) | FilesystemChangeRename

type FilesystemChangeEvent = js.Array[FilesystemChange]

type TestRunner = js.Function1[/* params */ TestRunnerParams, js.Promise[Double]]
