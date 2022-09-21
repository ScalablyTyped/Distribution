package typings.angularCommon.httpMod

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpContext")
@js.native
open class HttpContext () extends StObject {
  
  /**
    * Delete the value associated with the given token.
    *
    * @param token The reference to an instance of `HttpContextToken`.
    *
    * @returns A reference to itself for easy chaining.
    */
  def delete(token: HttpContextToken[Any]): HttpContext = js.native
  
  /**
    * Retrieve the value associated with the given token.
    *
    * @param token The reference to an instance of `HttpContextToken`.
    *
    * @returns The stored value or default if one is defined.
    */
  def get[T](token: HttpContextToken[T]): T = js.native
  
  /**
    * Checks for existence of a given token.
    *
    * @param token The reference to an instance of `HttpContextToken`.
    *
    * @returns True if the token exists, false otherwise.
    */
  def has(token: HttpContextToken[Any]): Boolean = js.native
  
  /**
    * @returns a list of tokens currently stored in the context.
    */
  def keys(): IterableIterator[HttpContextToken[Any]] = js.native
  
  /* private */ val map: Any = js.native
  
  /**
    * Store a value in the context. If a value is already present it will be overwritten.
    *
    * @param token The reference to an instance of `HttpContextToken`.
    * @param value The value to store.
    *
    * @returns A reference to itself for easy chaining.
    */
  def set[T](token: HttpContextToken[T], value: T): HttpContext = js.native
}
