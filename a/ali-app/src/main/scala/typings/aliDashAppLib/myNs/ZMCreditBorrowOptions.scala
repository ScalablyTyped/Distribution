package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 信用借还 https://docs.alipay.com/mini/api/zmcreditborrow
trait ZMCreditBorrowOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 借用用户的收货地址，可选字段，最大长度128。推荐商户传入此值，会将此手机号码与用户身份信息进行匹配验证，防范欺诈风险。
  		 */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 物品借用地点的描述，便于用户知道物品是在哪里借的。可为空
  		 *
  		 */
  var borrow_shop_name: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 商户订单创建的起始借用时间，格式：YYYY - MM - DD HH: MM: SS。如果不传入或者为空，则认为订单创建起始时间为调用此接口时的时间。
  		 */
  var borrow_time: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 借用用户的真实身份证号，非必填字段。但name和cert_no必须同时非空，或者同时为空，一旦传入会对用户身份进行校验。
  		 */
  var cert_no: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 信用业务服务，注意：该字段不能为空，且必须根据说明的指引配置商户专属的场景ID，商户自助接入时，登录后台可配置场景ID，将后台配置的场景ID作为该字段的输入；
  		 * 参考说明一自助进行配置；
  		 */
  var credit_biz: java.lang.String
  /**
  		 * 押金，金额单位：元。
  		 * 注：不允许免押金的用户按此金额支付押金；当物品丢失时，赔偿金额不得高于该金额。
  		 */
  var deposit_amount: java.lang.String
  /**
  		 * 该字段目前默认传Y；
  		 * 是否支持当借用用户信用不够（不准入）时，可让用户支付押金借用:
  		 * Y: 支持
  		 * N: 不支持
  		 * 注：支付押金的金额等同于deposit_amount。
  		 */
  var deposit_state: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 到期时间，不允许为空，请根据实际业务合理设置该值，格式：YYYY - MM - DD HH: MM: SS，是指最晚归还时间，表示借用用户如果超过此时间还未完结订单（未归还物品或者未支付租金）将会进入逾期状态，芝麻会给借用用户发送催收提醒；需要晚于borrow_time。
  		 */
  var expiry_time: java.lang.String
  /**
  		 * 物品名称,最长不能超过14个汉字
  		 */
  var goods_name: java.lang.String
  	// 该字段目前默认传Y；
  /**
  		 * 回调到商户的小程序schema地址。说明：商户的回调地址可以在商户后台里进行配置，服务端回调时，首先根据参数：invoke_type 查询是否有对应的配置地址，如果有，则使用已定义的地址，否则，使用该字段定义的地址执行回调；
  		 * 参考表格下方的说明一；
  		 * 小程序回调地址参考表格下方的说明三；
  		 * 说明一：
  		 * 		支付宝商户账号登录我的商家服务打开入口链接；
  		 * 		商家服务中选择“您可能需要->信用借还”或者点击链接；
  		 * 		场景ID配置->配置新ID，选择对应的业务类型、服务类目和联盟，将生成的场景ID作为credit_biz的值传入即可；
  		 * 		回调地址配置->设置小程序回调地址，注意：若设置了该回调地址，则接口my.zmCreditBorrow中的入参invoke_return_url将会失效，以该处设置为准；
  		 * 说明三:
  		 * 		小程序回调地址示例一：alipays://platformapi/startapp?appId=1999；
  		 * 		小程序回调地址示例二：alipays://platformapi/startapp?appId=1999&page=pages/map；
  		 */
  var invoke_return_url: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 商户请求状态上下文。商户发起借用服务时，需要在借用结束后返回给商户的参数，格式：json；
  		 * 如果json的某一项值包含中文，请使用encodeURIComponent对该值进行编码；
  		 * @example
  		 * var ext = {
  		 * 	name: encodeURIComponent('名字')
  		 * };
  		 * var obj = {
  		 * 	invoke_state: JSON.stringify(ext)
  		 * }
  		 */
  var invoke_state: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 商户访问蚂蚁的对接模式，默认传TINYAPP：
  		 * TINYAPP：回跳至小程序地址；
  		 * WINDOWS：支付宝服务窗，默认值；
  		 */
  var invoke_type: js.UndefOr[
    aliDashAppLib.aliDashAppLibStrings.TINYAPP | aliDashAppLib.aliDashAppLibStrings.WINDOWS | java.lang.String
  ] = js.undefined
  /**
  		 * 借用用户的手机号码，可选字段。推荐商户传入此值，会将此手机号码与用户身份信息进行匹配验证，防范欺诈风险。
  		 */
  var mobile_no: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 借用用户的真实姓名，非必填字段。但name和cert_no必须同时非空，或者同时为空，一旦传入会对用户身份进行校验。
  		 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 外部订单号，需要唯一，由商户传入，芝麻内部会做幂等控制，格式为：yyyyMMddHHmmss+随机数
  		 *
  		 */
  var out_order_no: java.lang.String
  /**
  		 * 信用借还的产品码，传入固定值：w1010100000000002858
  		 */
  var product_code: java.lang.String
  /**
  		 * 租金，租金 + 租金单位组合才具备实际的租金意义。
  		 * > 0.00元，代表有租金
  		 * = 0.00元，代表无租金，免费借用
  		 * 注：参数传值必须 >= 0，传入其他值会报错参数非法
  		 */
  var rent_amount: java.lang.String
  /**
  		 * 租金信息描述, 长度不超过14个汉字，只用于页面展示给C端用户，除此之外无其他意义。
  		 */
  var rent_info: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 租金的结算方式，非必填字段，默认是支付宝租金结算支付 merchant：表示商户自行结算，信用借还不提供租金支付能力； alipay：表示使用支付宝支付功能，给用户提供租金代扣及赔偿金支付能力；
  		 *
  		 */
  var rent_settle_type: js.UndefOr[
    aliDashAppLib.aliDashAppLibStrings.merchant | aliDashAppLib.aliDashAppLibStrings.alipay | java.lang.String
  ] = js.undefined
  /**
  		 * 租金单位，租金+租金单位组合才具备实际的租金意义。
  		 * 取值定义如下：
  		 * DAY_YUAN: 元 / 天
  		 * HOUR_YUAN: 元 / 小时
  		 * YUAN: 元
  		 * YUAN_ONCE: 元 / 次
  		 */
  var rent_unit: java.lang.String
  @JSName("success")
  var success_ZMCreditBorrowOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_4000, scala.Unit]] = js.undefined
}

