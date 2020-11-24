package typings.angularCommon.upgradeUpgradeMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.anon.Hash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/upgrade/upgrade", "UrlCodec")
@js.native
abstract class UrlCodec () extends js.Object {
  
  /**
    * Checks whether the two strings are equal
    * @param valA First string for comparison
    * @param valB Second string for comparison
    */
  def areEqual(valA: String, valB: String): Boolean = js.native
  
  /**
    * Decodes the hash from the provided string
    *
    * @param path The hash string
    */
  def decodeHash(hash: String): String = js.native
  
  /**
    * Decodes the path from the provided string
    *
    * @param path The path string
    */
  def decodePath(path: String): String = js.native
  
  /**
    * Decodes the search objects from the provided string
    *
    * @param path The path string
    */
  def decodeSearch(search: String): StringDictionary[js.Any] = js.native
  
  /**
    * Encodes the hash from the provided string
    *
    * @param path The hash string
    */
  def encodeHash(hash: String): String = js.native
  
  /**
    * Encodes the path from the provided string
    *
    * @param path The path string
    */
  def encodePath(path: String): String = js.native
  
  /**
    * Encodes the search string from the provided string or object
    *
    * @param path The path string or object
    */
  def encodeSearch(search: String): String = js.native
  def encodeSearch(search: StringDictionary[js.Any]): String = js.native
  
  /**
    * Normalizes the URL from the provided string
    *
    * @param path The URL string
    */
  def normalize(href: String): String = js.native
  /**
    * Normalizes the URL from the provided string, search, hash, and base URL parameters
    *
    * @param path The URL path
    * @param search The search object
    * @param hash The has string
    * @param baseUrl The base URL for the URL
    */
  def normalize(path: String, search: StringDictionary[js.Any], hash: String): String = js.native
  def normalize(path: String, search: StringDictionary[js.Any], hash: String, baseUrl: String): String = js.native
  
  /**
    * Parses the URL string based on the base URL
    *
    * @param url The full URL string
    * @param base The base for the URL
    */
  def parse(url: String): Hash = js.native
  def parse(url: String, base: String): Hash = js.native
}
