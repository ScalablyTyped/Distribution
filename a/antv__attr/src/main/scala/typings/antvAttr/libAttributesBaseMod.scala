package typings.antvAttr

import org.scalablytyped.runtime.Instantiable1
import typings.antvAttr.libInterfaceMod.AttributeCfg
import typings.antvAttr.libInterfaceMod.CallbackType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAttributesBaseMod {
  
  @JSImport("@antv/attr/lib/attributes/base", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Attribute {
    def this(cfg: AttributeCfg) = this()
    
    /* private */ /* CompleteClass */
    var _getAttributeValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var _parseCfg: Any = js.native
    
    /**
      * 通过 scale 拿到数据对应的原始的参数
      * @param param
      * @param scale
      * @private
      */
    /* private */ /* CompleteClass */
    var _toOriginParam: Any = js.native
    
    /* CompleteClass */
    override def callback(args: Any*): js.Array[Any] = js.native
    /* CompleteClass */
    @JSName("callback")
    var callback_Original: CallbackType = js.native
    
    /**
      * 默认的回调函数（用户没有自定义 callback，或者用户自定义 callback 返回空的时候，使用 values 映射）
      * @param params
      */
    /* private */ /* CompleteClass */
    var defaultCallback: Any = js.native
    
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
    override def getNames(): js.Array[Any] = js.native
    
    /**
      * 根据名称获取度量
      * @param name
      */
    /* CompleteClass */
    override def getScale(name: String): Any = js.native
    
    /* CompleteClass */
    var linear: Boolean = js.native
    
    /**
      * 映射的值组成的数组
      * @param params 对应 scale 顺序的值传入
      */
    /* CompleteClass */
    override def mapping(params: Any*): js.Array[Any] = js.native
    
    /* CompleteClass */
    var names: js.Array[String] = js.native
    
    /* CompleteClass */
    var scales: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
      ] = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var values: js.Array[Any] = js.native
  }
  
  trait Attribute extends StObject {
    
    /* private */ var _getAttributeValue: Any
    
    /* private */ var _parseCfg: Any
    
    /**
      * 通过 scale 拿到数据对应的原始的参数
      * @param param
      * @param scale
      * @private
      */
    /* private */ var _toOriginParam: Any
    
    def callback(args: Any*): js.Array[Any]
    @JSName("callback")
    var callback_Original: CallbackType
    
    /**
      * 默认的回调函数（用户没有自定义 callback，或者用户自定义 callback 返回空的时候，使用 values 映射）
      * @param params
      */
    /* private */ var defaultCallback: Any
    
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
    def getNames(): js.Array[Any]
    
    /**
      * 根据名称获取度量
      * @param name
      */
    def getScale(name: String): Any
    
    var linear: Boolean
    
    /**
      * 映射的值组成的数组
      * @param params 对应 scale 顺序的值传入
      */
    def mapping(params: Any*): js.Array[Any]
    
    var names: js.Array[String]
    
    var scales: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
      ]
    
    var `type`: String
    
    var values: js.Array[Any]
  }
  object Attribute {
    
    inline def apply(
      _getAttributeValue: Any,
      _parseCfg: Any,
      _toOriginParam: Any,
      callback: CallbackType,
      defaultCallback: Any,
      getFields: () => js.Array[String],
      getLinearValue: Double => Double | String,
      getNames: () => js.Array[Any],
      getScale: String => Any,
      linear: Boolean,
      mapping: /* repeated */ Any => js.Array[Any],
      names: js.Array[String],
      scales: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
        ],
      `type`: String,
      values: js.Array[Any]
    ): Attribute = {
      val __obj = js.Dynamic.literal(_getAttributeValue = _getAttributeValue.asInstanceOf[js.Any], _parseCfg = _parseCfg.asInstanceOf[js.Any], _toOriginParam = _toOriginParam.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], defaultCallback = defaultCallback.asInstanceOf[js.Any], getFields = js.Any.fromFunction0(getFields), getLinearValue = js.Any.fromFunction1(getLinearValue), getNames = js.Any.fromFunction0(getNames), getScale = js.Any.fromFunction1(getScale), linear = linear.asInstanceOf[js.Any], mapping = js.Any.fromFunction1(mapping), names = names.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: CallbackType): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setDefaultCallback(value: Any): Self = StObject.set(x, "defaultCallback", value.asInstanceOf[js.Any])
      
      inline def setGetFields(value: () => js.Array[String]): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
      
      inline def setGetLinearValue(value: Double => Double | String): Self = StObject.set(x, "getLinearValue", js.Any.fromFunction1(value))
      
      inline def setGetNames(value: () => js.Array[Any]): Self = StObject.set(x, "getNames", js.Any.fromFunction0(value))
      
      inline def setGetScale(value: String => Any): Self = StObject.set(x, "getScale", js.Any.fromFunction1(value))
      
      inline def setLinear(value: Boolean): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
      
      inline def setMapping(value: /* repeated */ Any => js.Array[Any]): Self = StObject.set(x, "mapping", js.Any.fromFunction1(value))
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setScales(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]
      ): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any)*
      ): Self = StObject.set(x, "scales", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def set_getAttributeValue(value: Any): Self = StObject.set(x, "_getAttributeValue", value.asInstanceOf[js.Any])
      
      inline def set_parseCfg(value: Any): Self = StObject.set(x, "_parseCfg", value.asInstanceOf[js.Any])
      
      inline def set_toOriginParam(value: Any): Self = StObject.set(x, "_toOriginParam", value.asInstanceOf[js.Any])
    }
  }
  
  type AttributeConstructor = Instantiable1[/* cfg */ Any, Attribute]
}
