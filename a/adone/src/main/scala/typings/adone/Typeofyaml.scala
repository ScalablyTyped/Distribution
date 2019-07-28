package typings.adone

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable5
import typings.adone.adoneNs.dataNs.yamlNs.Mark
import typings.adone.adoneNs.dataNs.yamlNs.loaderNs.INs.Options
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofyaml extends js.Object {
  /**
    * Represents a YAML exception
    */
  var Exception: Instantiable2[/* reason */ String, /* mark */ Mark, typings.adone.adoneNs.dataNs.yamlNs.Exception] = js.native
  /**
    * Represetns a mark that is used in exceptions to define the error's location
    */
  var Mark: Instantiable5[
    /* name */ String, 
    /* buffer */ String, 
    /* position */ Double, 
    /* line */ Double, 
    /* column */ Double, 
    typings.adone.adoneNs.dataNs.yamlNs.Mark
  ] = js.native
  /**
    * YAML dumpers
    */
  val dumperNs: Typeofdumper = js.native
  /**
    * YAML loaders
    */
  val loaderNs: Typeofloader = js.native
  /**
    * YAML schemas
    */
  val schemaNs: Typeofschema = js.native
  /**
    * YAML types for custom schemas
    */
  val typeNs: Typeoftype = js.native
  /**
    * Decodes the given string/buffer using DEFAULT_SAFE scheme by default
    */
  def decode(buf: String): js.Any = js.native
  def decode(buf: String, options: Options): js.Any = js.native
  def decode(buf: Buffer): js.Any = js.native
  def decode(buf: Buffer, options: Options): js.Any = js.native
  /**
    * Encodes the given object using DEFAULT_SAFE scheme by default
    */
  def encode(obj: js.Any): Buffer = js.native
  def encode(obj: js.Any, options: typings.adone.adoneNs.dataNs.yamlNs.dumperNs.INs.Options): Buffer = js.native
}

