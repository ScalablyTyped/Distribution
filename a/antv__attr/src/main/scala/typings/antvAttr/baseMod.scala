package typings.antvAttr

import org.scalablytyped.runtime.Instantiable1
import typings.antvAttr.interfaceMod.AttributeCfg
import typings.antvAttr.interfaceMod.CallbackType
import typings.antvAttr.interfaceMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("@antv/attr/lib/attributes/base", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Attribute {
    def this(cfg: AttributeCfg) = this()
    
    /* CompleteClass */
    var _getAttributeValue: js.Any = js.native
    
    /* CompleteClass */
    var _parseCfg: js.Any = js.native
    
    /**
      * 通过 scale 拿到数据对应的原始的参数
      * @param param
      * @param scale
      * @private
      */
    /* CompleteClass */
    var _toOriginParam: js.Any = js.native
    
    /* CompleteClass */
    override def callback(args: js.Any*): js.Array[js.Any] = js.native
    /* CompleteClass */
    @JSName("callback")
    var callback_Original: CallbackType = js.native
    
    /**
      * 默认的回调函数（用户没有自定义 callback，或者用户自定义 callback 返回空的时候，使用 values 映射）
      * @param params
      */
    /* CompleteClass */
    var defaultCallback: js.Any = js.native
    
    /**
      * 获取所有的维度名
      */
    /* CompleteClass */
    override def getFields(): js.Array[String] = js.native
    
    /**
      * 如果进行线性映射，返回对应的映射值
      * @param percent
      */
    /* CompleteClass */
    override def getLinearValue(percent: Double): Double | String = js.native
    
    /**
      * 根据度量获取属性名
      */
    /* CompleteClass */
    override def getNames(): js.Array[js.Any] = js.native
    
    /**
      * 根据名称获取度量
      * @param name
      */
    /* CompleteClass */
    override def getScale(name: String): Scale = js.native
    
    /* CompleteClass */
    var linear: Boolean = js.native
    
    /**
      * 映射的值组成的数组
      * @param params 对应 scale 顺序的值传入
      */
    /* CompleteClass */
    override def mapping(params: js.Any*): js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var names: js.Array[String] = js.native
    
    /* CompleteClass */
    var scales: js.Array[Scale] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var values: js.Array[js.Any] = js.native
  }
  
  trait Attribute extends StObject {
    
    var _getAttributeValue: js.Any
    
    var _parseCfg: js.Any
    
    /**
      * 通过 scale 拿到数据对应的原始的参数
      * @param param
      * @param scale
      * @private
      */
    var _toOriginParam: js.Any
    
    def callback(args: js.Any*): js.Array[js.Any]
    @JSName("callback")
    var callback_Original: CallbackType
    
    /**
      * 默认的回调函数（用户没有自定义 callback，或者用户自定义 callback 返回空的时候，使用 values 映射）
      * @param params
      */
    var defaultCallback: js.Any
    
    /**
      * 获取所有的维度名
      */
    def getFields(): js.Array[String]
    
    /**
      * 如果进行线性映射，返回对应的映射值
      * @param percent
      */
    def getLinearValue(percent: Double): Double | String
    
    /**
      * 根据度量获取属性名
      */
    def getNames(): js.Array[js.Any]
    
    /**
      * 根据名称获取度量
      * @param name
      */
    def getScale(name: String): Scale
    
    var linear: Boolean
    
    /**
      * 映射的值组成的数组
      * @param params 对应 scale 顺序的值传入
      */
    def mapping(params: js.Any*): js.Array[js.Any]
    
    var names: js.Array[String]
    
    var scales: js.Array[Scale]
    
    var `type`: String
    
    var values: js.Array[js.Any]
  }
  object Attribute {
    
    @scala.inline
    def apply(
      _getAttributeValue: js.Any,
      _parseCfg: js.Any,
      _toOriginParam: js.Any,
      callback: CallbackType,
      defaultCallback: js.Any,
      getFields: () => js.Array[String],
      getLinearValue: Double => Double | String,
      getNames: () => js.Array[js.Any],
      getScale: String => Scale,
      linear: Boolean,
      mapping: /* repeated */ js.Any => js.Array[js.Any],
      names: js.Array[String],
      scales: js.Array[Scale],
      `type`: String,
      values: js.Array[js.Any]
    ): Attribute = {
      val __obj = js.Dynamic.literal(_getAttributeValue = _getAttributeValue.asInstanceOf[js.Any], _parseCfg = _parseCfg.asInstanceOf[js.Any], _toOriginParam = _toOriginParam.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], defaultCallback = defaultCallback.asInstanceOf[js.Any], getFields = js.Any.fromFunction0(getFields), getLinearValue = js.Any.fromFunction1(getLinearValue), getNames = js.Any.fromFunction0(getNames), getScale = js.Any.fromFunction1(getScale), linear = linear.asInstanceOf[js.Any], mapping = js.Any.fromFunction1(mapping), names = names.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: CallbackType): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCallback(value: js.Any): Self = StObject.set(x, "defaultCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetFields(value: () => js.Array[String]): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLinearValue(value: Double => Double | String): Self = StObject.set(x, "getLinearValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNames(value: () => js.Array[js.Any]): Self = StObject.set(x, "getNames", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScale(value: String => Scale): Self = StObject.set(x, "getScale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinear(value: Boolean): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapping(value: /* repeated */ js.Any => js.Array[js.Any]): Self = StObject.set(x, "mapping", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setScales(value: js.Array[Scale]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesVarargs(value: Scale*): Self = StObject.set(x, "scales", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
      
      @scala.inline
      def set_getAttributeValue(value: js.Any): Self = StObject.set(x, "_getAttributeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_parseCfg(value: js.Any): Self = StObject.set(x, "_parseCfg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_toOriginParam(value: js.Any): Self = StObject.set(x, "_toOriginParam", value.asInstanceOf[js.Any])
    }
  }
  
  type AttributeConstructor = Instantiable1[/* cfg */ js.Any, Attribute]
}
