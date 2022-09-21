package typings.arangodb.Foxx

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Configuration = StringDictionary[Any]

type Dependencies = StringDictionary[Any]

type Handler = js.Function2[/* req */ Request, /* res */ Response, Unit]

type Middleware = SimpleMiddleware | DelegateMiddleware

type NextFunction = js.Function0[Unit]

type SimpleMiddleware = js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
