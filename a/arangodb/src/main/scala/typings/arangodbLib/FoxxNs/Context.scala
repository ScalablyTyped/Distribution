package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var argv: js.Array[_] = js.native
  var basePath: java.lang.String = js.native
  var baseUrl: java.lang.String = js.native
  var collectionPrefix: java.lang.String = js.native
  var configuration: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  var dependencies: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  var isDevelopment: scala.Boolean = js.native
  var isProduction: scala.Boolean = js.native
  var manifest: Manifest = js.native
  var mount: java.lang.String = js.native
  def collection(name: java.lang.String): arangodbLib.ArangoDBNs.Collection[_] | scala.Null = js.native
  def collectionName(name: java.lang.String): java.lang.String = js.native
  def createDocumentationRouter(): Router = js.native
  def createDocumentationRouter(opts: java.lang.String): Router = js.native
  def createDocumentationRouter(
    opts: js.Function2[
      /* req */ Request, 
      /* res */ Response, 
      scala.Unit | arangodbLib.arangodbLibNumbers.`false`
    ]
  ): Router = js.native
  def createDocumentationRouter(opts: stdLib.Partial[DocumentationRouterOptions]): Router = js.native
  def file(name: java.lang.String): nodeLib.Buffer = js.native
  def file(name: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def fileName(name: java.lang.String): java.lang.String = js.native
  def registerType(`type`: java.lang.String, `def`: TypeDefinition): scala.Unit = js.native
  def use(path: java.lang.String, routerOrMiddleware: Middleware): Endpoint = js.native
  def use(path: java.lang.String, routerOrMiddleware: Middleware, name: java.lang.String): Endpoint = js.native
  def use(path: java.lang.String, routerOrMiddleware: Router): Endpoint = js.native
  def use(path: java.lang.String, routerOrMiddleware: Router, name: java.lang.String): Endpoint = js.native
  def use(routerOrMiddleware: Middleware): Endpoint = js.native
  def use(routerOrMiddleware: Middleware, name: java.lang.String): Endpoint = js.native
  def use(routerOrMiddleware: Router): Endpoint = js.native
  def use(routerOrMiddleware: Router, name: java.lang.String): Endpoint = js.native
}

