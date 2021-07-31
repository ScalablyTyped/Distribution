package typings.adler32

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("adler-32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bstr(data: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bstr")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def bstr(data: String, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bstr")(data.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def buf(data: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("buf")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def buf(data: js.Array[Double], seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("buf")(data.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def buf(data: Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("buf")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def buf(data: Uint8Array, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("buf")(data.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def str(data: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def str(data: String, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("str")(data.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("adler-32", "version")
  @js.native
  val version: String = js.native
}
