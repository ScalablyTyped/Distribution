package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Configuration = org.scalablytyped.runtime.StringDictionary[js.Any]

type Dependencies = org.scalablytyped.runtime.StringDictionary[js.Any]

type Handler = js.Function2[
/* req */ typings.arangodb.Foxx.Request, 
/* res */ typings.arangodb.Foxx.Response, 
scala.Unit]

type Middleware = typings.arangodb.Foxx.SimpleMiddleware | typings.arangodb.Foxx.DelegateMiddleware

type NextFunction = js.Function0[scala.Unit]

type SimpleMiddleware = js.Function3[
/* req */ typings.arangodb.Foxx.Request, 
/* res */ typings.arangodb.Foxx.Response, 
/* next */ typings.arangodb.Foxx.NextFunction, 
scala.Unit]
