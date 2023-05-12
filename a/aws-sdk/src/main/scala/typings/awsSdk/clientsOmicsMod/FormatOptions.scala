package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatOptions extends StObject {
  
  /**
    * Options for a TSV file.
    */
  var tsvOptions: js.UndefOr[TsvOptions] = js.undefined
  
  /**
    * Options for a VCF file.
    */
  var vcfOptions: js.UndefOr[VcfOptions] = js.undefined
}
object FormatOptions {
  
  inline def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
    
    inline def setTsvOptions(value: TsvOptions): Self = StObject.set(x, "tsvOptions", value.asInstanceOf[js.Any])
    
    inline def setTsvOptionsUndefined: Self = StObject.set(x, "tsvOptions", js.undefined)
    
    inline def setVcfOptions(value: VcfOptions): Self = StObject.set(x, "vcfOptions", value.asInstanceOf[js.Any])
    
    inline def setVcfOptionsUndefined: Self = StObject.set(x, "vcfOptions", js.undefined)
  }
}
