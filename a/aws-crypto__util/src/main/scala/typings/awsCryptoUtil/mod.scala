package typings.awsCryptoUtil

import typings.awsSdkTypes.distTypesCryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-crypto/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToBuffer(data: SourceData): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def isEmptyData(data: SourceData): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyData")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def numToUint8(num: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("numToUint8")(num.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def uint32ArrayFrom(a_lookUpTable: js.Array[Double]): js.typedarray.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("uint32ArrayFrom")(a_lookUpTable.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint32Array]
}
