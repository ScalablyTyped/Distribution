package typings.arcgisJsApi

import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type GroupKey[T] = Exclude[T, IHandle]

type HashMap[T] = Record[String, T]

/** @deprecated Use native Promise instead. */
type IPromise[T] = js.Promise[T]
