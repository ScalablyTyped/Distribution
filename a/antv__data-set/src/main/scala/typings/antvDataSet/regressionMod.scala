package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.boxcar
import typings.antvDataSet.antvDataSetStrings.cosine
import typings.antvDataSet.antvDataSetStrings.epanechnikov
import typings.antvDataSet.antvDataSetStrings.gaussian
import typings.antvDataSet.antvDataSetStrings.quartic
import typings.antvDataSet.antvDataSetStrings.triangular
import typings.antvDataSet.antvDataSetStrings.tricube
import typings.antvDataSet.antvDataSetStrings.triweight
import typings.antvDataSet.antvDataSetStrings.uniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regressionMod {
  
  object default {
    
    @JSImport("@antv/data-set/lib/transform/kernel-smooth/regression", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/data-set/lib/transform/kernel-smooth/regression", "default.KERNEL_METHODS")
    @js.native
    def KERNEL_METHODS: js.Array[js.Any] = js.native
    @scala.inline
    def KERNEL_METHODS_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KERNEL_METHODS")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Tuple2[String, js.UndefOr[String]]] = js.native
    
    var bandwidth: js.UndefOr[Double] = js.native
    
    var extent: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var fields: js.UndefOr[js.Tuple2[String, js.UndefOr[String]]] = js.native
    
    var method: cosine | epanechnikov | gaussian | quartic | triangular | tricube | triweight | uniform | boxcar = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      method: cosine | epanechnikov | gaussian | quartic | triangular | tricube | triweight | uniform | boxcar
    ): Options = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Tuple2[String, js.UndefOr[String]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
      
      @scala.inline
      def setExtent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setFields(value: js.Tuple2[String, js.UndefOr[String]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setMethod(
        value: cosine | epanechnikov | gaussian | quartic | triangular | tricube | triweight | uniform | boxcar
      ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
}
